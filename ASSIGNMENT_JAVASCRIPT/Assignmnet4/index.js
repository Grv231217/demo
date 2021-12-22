
if(!localStorage.getItem("local"))
{
    localStorage.setItem("local",10);
    document.getElementById("counter1").textContent = parseInt(localStorage.getItem("local"));
}
else
{
    document.getElementById("counter1").textContent = parseInt(localStorage.getItem("local"));
}
function clickFun1()
{
    var val = parseInt(localStorage.getItem("local"))+1;
    localStorage.setItem("local",val);
    document.getElementById("counter1").textContent = val;
}

if(!sessionStorage.getItem("session"))
{
    sessionStorage.setItem("session",0);
    document.getElementById("counter2").textContent = parseInt(sessionStorage.getItem("session"));
}
else{
    document.getElementById("counter2").textContent = parseInt(sessionStorage.getItem("session"));
}
function clickFun2()
{
    var val = parseInt(sessionStorage.getItem("session"))+1;
    sessionStorage.setItem("session",val);
    document.getElementById("counter2").textContent = val;
}

function clear()
{
    localStorage.clear();
}