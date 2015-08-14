var blogsItemTemplate = Handlebars.compile($("#blogs-item-template").html());
var data = [3];
var count = 0;
var a = "false";
var source;

$(function() {
        $.getJSON("/customer/Cards")
            .done(function(result) {
                for (var i in result)
                $("#blogs").append(blogsItemTemplate({
                    img_url: result[i].img_url,
                    img_id:result[i].img_id
                }));
            }).fail(function() {
                console.log("Not found");
            })
        });

  $(function(){     
          $("#Submit").on("click",function(){
            $.getJSON("Cards/comeback?id1="+data[0]+"&id2="+data[1]+"&id3="+data[2])
            .done(function(result){
                if(result.Result === "true"){
                    a=result.Result;
                $('li').remove('#'+data[0]);
                $('li').remove('#'+data[1]);
                $('li').remove('#'+data[2]);}
            }).fail(function() {
                console.log("Not found");
            })
          $.getJSON("/customer/Cards/two")
            .done(function(result) {
                console.log("in cards 2")
              if(a === "true"){
                for (var i in result)
                $("#blogs").append(blogsItemTemplate({
                    img_url: result[i].img_url, 
                    img_id:result[i].img_id
                }));}
        });
    })
  })

$(document).on("click", ".list img", function() { 
     var id = ($(this).attr('id'));
     
     if(count>2){
         count = 0;
         //$(document.getElementById(data[0])).css('border', "solid 0px green");
     }
     if(id != data[0] && id != data[1] && id != data[2])
     {
        $(document.getElementById(data[0])).css(' border', "solid 0px green");
        $(document.getElementById(data[1])).css('border', "solid 0px green");
        $(document.getElementById(data[2])).css('border', "solid 0px green");
        data[count] =id;
        count = count + 1;
        for(var i=0; i<3; i++)
        {
            $(document.getElementById(data[i])).css('border', "solid 2px green");
        }
     }
}); 


$(function()
{
    $("#startButton").on("click",function(){
        source = new EventSource("api/counter?start=" + $("#startNum").val());
        source.onmessage = eventHandler;
    });
});

function eventHandler(event){
      console.log("event = " + JSON.stringify(event));
    $("#counter").text(event.data);
}


$(function(){
    source = new EventSource("api/gameroom");
    source.onmessage = function(event){
        var chat = JSON.parse(event.data);
        var $messages = $("#messages");
        console.log(JSON.stringify(chat))
        $messages.text(chat.name + ":" +chat.message + "\n" + $messages.text());
    }
    
    $("#sendBtn").on("click",function(){
        $.get("newMessage",{
            name:$("#name").val(),
            message:$("#msg").val()
        }).done(function(){
            $("msg").val("");
            console.log("on click done");
            console.log(source.onmessage())
        });
    })
});