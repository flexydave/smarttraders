var getList = document.getElementById("listIcon");
var getNav = document.getElementById("nav");
getList.addEventListener("click", function(){ 
    if(getNav.style.left == "0%"){ 
        getNav.style.left = "-100%"
        this.className = "bi-list"
    }else{ 
        getNav.style.left = "0%";
        
        this.className = "bi-x";

    }
})


var getSlide = document.getElementById("slide");
function slide(){ 
    if(document.documentElement.scrollTop >= 800){ 
        getSlide.style.right = "0"
    }else{ 
        getSlide.style.right = "20%"
    }
}

window.onresize = function(){ 
    getNav.style.left = "-100%";
    getList.className = "bi-list";
}

window.onscroll = function(){ 
    slide();
}

