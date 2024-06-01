var bearerToken = 'eyJhbGciOiJIUzI1NiJ9.eyJyb2xlIjpbeyJhdXRob3JpdHkiOiJSb2xlX1VTRVIifV0sInN1YiI6Imxha3ZpZHUwMEBnbWFpbC5jb20iLCJpYXQiOjE3MTcyMTQ3OTUsImV4cCI6MTcxNzMwMTE5NX0.dn5oVK4w9aYqqy8q90URNsXYqlCfdjizmzbu_YdT7SE';

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