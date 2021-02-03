$('document').ready(function(){
	
	$('.table #editButton').on('click', function(event){
		event.preventDefault();
		
		// states/findById/?id=1
		var href =$(this).attr('href');
		
		$.get(href, function(vehicleMake, status){
			$('#idEdit').val(vehicleMake.id);
			$('#descriptionEdit').val(vehicleMake.description);
			$('#detailsEdit').val(vehicleMake.details);
		});
		$('#editModal').modal();
	});
	
	$('.table #detailsButton').on('click',function(event){
		event.preventDefault();
		
		// vehicleMakes/findById/?id=1
		var href =$(this).attr('href');
		
		$.get(href, function(vehicleMake, status){
			$('#idDetails').val(vehicleMake.id);
			$('#descriptionDetails').val(vehicleMake.description);
			$('#detailsDetails').val(vehicleMake.details);
			$('#lastModifiedByDetails').val(vehicleMake.lastModifiedBy);
//			$('#lastModifiedDateDetails').val(vehicleMake.lastModifiedDate.substr(0,19).replace("T", ""));
		});
		$('#detailsModal').modal();
	});
	
	
	$('.table #deleteButton').on('click', function(event){
		event.preventDefault();
		
		//confirm delete
		var href=$(this).attr('href');
		$('#deleteModal #delRef').attr('href', href);
		$('#deleteModal').modal();
	});
});