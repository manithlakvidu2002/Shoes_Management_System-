var bearerToken = 'eyJhbGciOiJIUzI1NiJ9.eyJyb2xlIjpbeyJhdXRob3JpdHkiOiJSb2xlX0FETUlOIn1dLCJzdWIiOiJtYW5pdGhAZ21haWwuY29tIiwiaWF0IjoxNzE2Nzg5MDczLCJleHAiOjE3MTY4NzU0NzN9.qQXs9Mtu_gsogBFxvGoAsck91qMKQDxyXmEZd5rVau0';

function showAlert(iconType,titleMessage,textMessage){
    Swal.fire({
        icon: iconType,
        title: titleMessage,
        text: textMessage,
    });
}

function formatDate(dateString) {
    var date = new Date(dateString);
    var year = date.getFullYear();
    var month = ('0' + (date.getMonth() + 1)).slice(-2);
    var day = ('0' + date.getDate()).slice(-2);
    return `${year}-${month}-${day}`;
}