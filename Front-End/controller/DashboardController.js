let login = document.getElementById("login")
let signup = document.getElementById("signup")
let forgetPassword = document.getElementById("forgetPassword")


{
    login.style.display="block";
    signup.style.display="none";
    forgetPassword.style.display="none";
}
function log(){
    login.style.display="block";
    signup.style.display="none";
    forgetPassword.style.display="none";
}
function sign(){
    login.style.display="none";
    signup.style.display="block";
    forgetPassword.style.display="none";


}
function signsave(){
    login.style.display="block";
    signup.style.display="none";
    forgetPassword.style.display="none";

}
function newPassword(){
    login.style.display="none";
    signup.style.display="none";
    forgetPassword.style.display="block";
}
