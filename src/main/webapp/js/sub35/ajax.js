$("#button1").click(function() {
	$.ajax("/sub35/link1", { method: "post" });
});
$("#button2").click(function() {
	$.ajax("/sub35/link2", { method: "post" });
})
$("#button3").click(function() {
	$.ajax("/sub35/link3", {
		method: "post",
		data: "name=손"
	});
})

$("#button4").click(function() {
	$.ajax("/sub35/link4", {
		method: "post",
		data: "address=서울&price=99.77"
	});
})


$("#button5").click(function() {
	$.ajax("/sub35/link5", {
		method: "post",
		data: "name=발&score=7.5&email=val@googl.com"
	})
})















