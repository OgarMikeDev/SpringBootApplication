//Adding user
$("#button_form_registration_user").click(function() {
     var data = $("#container_for_form form").serialize();
     console.log(data)
     $.ajax({
         method: "POST",
         url: "/addUser/",
         data: data,
         success: function(response) {
             var user = {};
             user.id = response;
             var dataArray = $("#container_for_form form").serializeArray();
             for(i in dataArray) {
                 user[dataArray[i]["email"]] = dataArray[i]["value"];
             }
             document.getElementById("name_form_for_registration").reset();
         }
     });
     return false;
});