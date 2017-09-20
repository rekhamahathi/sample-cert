$(document).ready( function () {
	 var table = $('#certificatesTableFor7').DataTable({
			"sAjaxSource": "/7/certificates",
			"sAjaxDataProp": "",
			"order": [[ 0, "asc" ]],
			"aoColumns": [
		          { "mData": "certificateName" },
				  { "mData": "certificateProvider" },
				  { "mData": "expiryDate" }
			]
	 })

	 var table = $('#certificatesTableFor14').DataTable({
     			"sAjaxSource": "/14/certificates",
     			"sAjaxDataProp": "",
     			"order": [[ 0, "asc" ]],
     			"aoColumns": [
     		          { "mData": "certificateName" },
     				  { "mData": "certificateProvider" },
     				  { "mData": "expiryDate" }
     			]
     	 })

     	 var table = $('#certificatesTableFor30').DataTable({
         			"sAjaxSource": "/30/certificates",
         			"sAjaxDataProp": "",
         			"order": [[ 0, "asc" ]],
         			"aoColumns": [
         		          { "mData": "certificateName" },
         				  { "mData": "certificateProvider" },
         				  { "mData": "expiryDate" }
         			]
         	 })
});