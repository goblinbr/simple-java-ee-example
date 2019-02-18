function count() {
    document.getElementById('countgroup').style = 'display:none';

    var request = new XMLHttpRequest();
    request.onreadystatechange = function() {
        if (this.readyState == 4 && this.status == 200) {
            var accessCount = JSON.parse(this.responseText);

            document.getElementById('countspan').innerText = accessCount.qty;
            document.getElementById('countgroup').style = 'display:block';
        }
    };

    request.open("PUT", "rest/test/count/index", true);
    request.setRequestHeader("Content-type", "application/json");
    request.send();
}