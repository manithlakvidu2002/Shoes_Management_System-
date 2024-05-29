var bearerToken = 'eyJhbGciOiJIUzI1NiJ9.eyJyb2xlIjpbeyJhdXRob3JpdHkiOiJSb2xlX1VTRVIifV0sInN1YiI6Imxha3ZpZHUwMEBnbWFpbC5jb20iLCJpYXQiOjE3MTcwMDE2MjksImV4cCI6MTcxNzA4ODAyOX0.UAXBPXquPhsoYSSEKaM-i27EJmaDN2Uue7_dKBmZxI8';

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