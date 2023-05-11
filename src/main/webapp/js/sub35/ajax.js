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

$("#button6").click(function() {
	$.ajax("/sub35/link6", {
		method: "post",
		data: "address=부산&product=자동차&price=300.12"
	})
})



$("#button7").click(function() {
	$.ajax("/sub35/link7", {
		method: "post",
		data: '{"name": "son"}',
		contentType: "application/json"
	})
})

$("#button8").click(function() {
	$.ajax("/sub35/link8", {
		method: "post",
		contentType: "application/json",
		data: '{"address":"seoul", "name":"박지성"}'
	})
})

$("#button9").click(function() {
	$.ajax("/sub35/link9", {
		method: "post",
		contentType: "application/json",
		data: `{"age": 33.5, "name": "cha", "married": true}`
	})
});

$("#button10").click(function() {
	$.ajax("/sub35/link10", {
		method: "post",
		contentType: "application/json",
		data: `{"address": null, "age": 30, "name": "손흥민"}`
	})
})

$("#button11").click(function() {
	$.ajax("/sub35/link11", {
		method: "post",
		contentType: "application/json",
		data: `{"book": {"title": "java", "price": 300}, "address": "seoul"}`
	})
})

$("#button12").click(function() {
	$.ajax("/sub35/link12", {
		method: "post",
		contentType: "application/json",
		data: `{"food":["pizza", "coke", "coffee"], "store": "피자스쿨"}`
	})
})





















