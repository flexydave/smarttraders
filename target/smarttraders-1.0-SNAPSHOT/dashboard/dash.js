// hide and show the side navs of the page

var showNav = document.getElementById("showNav");
var sideNav = document.getElementById("sideNav");
var topNav = document.getElementById("topNav");
var main = document.getElementById("main");

showNav.addEventListener("click", function(){ 
    if(sideNav.style.left == "0%"){ 
        sideNav.style.left = "-100%";
        topNav.style.width = "100%";
        main.style.width = "100%";
        main.style.left = "0";
    }
    else{ 
        sideNav.style.left = "0%";
        sideNav.style.width = "60%"
        topNav.style.width = "40%";
}


}) 

window.onresize = function(){ 
    if(sideNav.style.left == "0%"){ 
        sideNav.style.left = "-100%";
        topNav.style.width = "100%";
        main.style.width = "100%";
        main.style.left = "0";
    }
    else{ 
        sideNav.style.left = "0%";
        sideNav.style.width = "20%"
        topNav.style.width = "80%";
}
}

// show the notification bar of the page

var getNoti = document.getElementById("showNoti");
var noti = document.getElementById("noti");

getNoti.addEventListener("click", function(){ 
    if(noti.style.display == "block"){ 
        noti.style.display = "none";
    }
    else{ 
        noti.style.display = "block";
    } 
})




// hide and show the amounts of the money 

var hideAmount = document.getElementById("hide");
var getText = document.getElementById("demo");
hideAmount.addEventListener("click", function(){ 
    if(this.className == "bi-eye-slash-fill"){ 
        this.className = "bi-eye-fill";
        getText.innerHTML = "*** *** ***";
    }else{ 
        this.className = "bi-eye-slash-fill";
        var a = 20000000;
        getText.innerHTML = a.toLocaleString();
    }
})




var toTransaction = document.getElementById("toTransaction");
toTransaction.addEventListener("click", function(){ 
    document.location = "../transactions/index.html"
})














