function getData(uId) {
    return new Promise(function(resolve,reject){
    setTimeout(() => {
    console.log("Fetched the data!");
    return uId+"@gmail.com";
    }, 4000);
    })
}
console.log("start");
getData("skc")
    .then(function grv(email) {
        console.log("Email id of the user id is: "+email);
    }).catch(function grv(email) {
        console.log("Error");
    });