function cancelFormSubmission(returnUrl) {
	if (confirm("Do you want to discard the changes?")) {
		window.location.href = "http://localhost:8080" + returnUrl;
	}
}

function getBrandsByCompany(){
	var companyId= document.getElementById("companyId").value;
	
	$.getJSON("http://localhost:8080/techspace/mobiles/mobile/brandsByCompany?companyId="+companyId, function(data){
		var option_data = '';
		$.each(data, function(key,value){
			option_data += '<option value='+value.id+'>'+value.name+'</option>';
		});
		if(option_data == ''){
			option_data += '<option value="BR0">No Brand Found</option>';
		}
		$('#brandId').html(option_data);
	});	

} 
