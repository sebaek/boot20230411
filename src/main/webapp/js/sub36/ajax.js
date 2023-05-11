$("#btn1").click(function() {
	const obj = {
		name: "정대만",
		age: 40
	}
	$.ajax("/sub36/link1", {
		method: "post",
		contentType: "application/json",
		data: JSON.stringify(obj)
	})
})

$("#btn2").click(function() {
	const data = {
		name: "강백호",
		email: "kang@gmail.com",
		score: 99.99,
		married: true
	}
	$.ajax("/sub36/link2", {
		method: "post",
		contentType:"application/json",
		data: JSON.stringify(data)
	})
})














