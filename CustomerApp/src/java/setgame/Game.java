/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package setgame;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author A0136582b
 */
@Entity
@Table(name = "game")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Game.findAll", query = "SELECT g FROM Game g"),
    @NamedQuery(name = "Game.findByGameID", query = "SELECT g FROM Game g WHERE g.gameID = :gameID"),
    @NamedQuery(name = "Game.findByGameInstance", query = "SELECT g FROM Game g WHERE g.gameInstance = :gameInstance"),
    @NamedQuery(name = "Game.findByNumPlayers", query = "SELECT g FROM Game g WHERE g.numPlayers = :numPlayers"),
    @NamedQuery(name = "Game.findByGameDuration", query = "SELECT g FROM Game g WHERE g.gameDuration = :gameDuration")})
public class Game implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "gameID")
    private String gameID;
    @Basic(optional = false)
    @NotNull
    @Column(name = "gameInstance")
    private int gameInstance;
    @Basic(optional = false)
    @NotNull
    @Column(name = "numPlayers")
    private int numPlayers;
    @Size(max = 45)
    @Column(name = "gameDuration")
    private String gameDuration;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "gameID")
    private Collection<User> userCollection;

    public Game() {
    }

    public Game(String gameID) {
        this.gameID = gameID;
    }

    public Game(String gameID, int gameInstance, int numPlayers) {
        this.gameID = gameID;
        this.gameInstance = gameInstance;
        this.numPlayers = numPlayers;
    }

    public String getGameID() {
        return gameID;
    }

    public void setGameID(String gameID) {
        this.gameID = gameID;
    }

    public int getGameInstance() {
        return gameInstance;
    }

    public void setGameInstance(int gameInstance) {
        this.gameInstance = gameInstance;
    }

    public int getNumPlayers() {
        return numPlayers;
    }

    public void setNumPlayers(int numPlayers) {
        this.numPlayers = numPlayers;
    }

    public String getGameDuration() {
        return gameDuration;
    }

    public void setGameDuration(String gameDuration) {
        this.gameDuration = gameDuration;
    }

    @XmlTransient
    public Collection<User> getUserCollection() {
        return userCollection;
    }

    public void setUserCollection(Collection<User> userCollection) {
        this.userCollection = userCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (gameID != null ? gameID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Game)) {
            return false;
        }
        Game other = (Game) object;
        if ((this.gameID == null && other.gameID != null) || (this.gameID != null && !this.gameID.equals(other.gameID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "setgame.Game[ gameID=" + gameID + " ]";
    }
    
}
