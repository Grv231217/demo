
//This function takes other function as input as well as other parameters of first and last name to return there combination of 1st letters
arrow = (firstName,lastName,func) => {
    alert(func());
    return firstName()[0]+lastName()[0];
}
function func()
{
    return 'alert';
}
function firstName()
{
    return 'Gaurav';
}

function lastName()
{
    return 'Verma';
}

console.log(arrow(firstName,lastName,func));

