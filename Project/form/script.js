function validateForm() {

    var name = document.getElementById("name").value;
    var email = document.getElementById("email").value;
    var mobile = document.getElementById("mobile").value;
    var dept = document.getElementById("dept").value;
    var comments = document.getElementById("comments").value;

    var gender = document.getElementsByName("gender");

    if(name == ""){
        alert("Name required");
        return false;
    }

    var emailPattern = /^[^ ]+@[^ ]+\.[a-z]{2,3}$/;

    if(!email.match(emailPattern)){
        alert("Invalid email");
        return false;
    }

    if(!/^[0-9]{10}$/.test(mobile)){
        alert("Invalid mobile");
        return false;
    }

    if(dept == ""){
        alert("Select department");
        return false;
    }

    var selected = false;

    for(var i=0;i<gender.length;i++){
        if(gender[i].checked){
            selected = true;
        }
    }

    if(!selected){
        alert("Select gender");
        return false;
    }

    if(comments.split(" ").length < 10){
        alert("Minimum 10 words");
        return false;
    }

    alert("Form submitted");
    return true;
}