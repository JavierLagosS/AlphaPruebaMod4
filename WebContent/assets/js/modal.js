$(document).ready(function() {
	$("body").on("click", ".eliminarPersona", function() {
		var id_persona = Number($(this).closest("tr").children("td").eq(0).html());
		var persona_activacion = 0;
		$("#procesarEliminarPersona").find("input[name='id_persona']").val(id_persona);
		$("#procesarEliminarPersona").find("input[name='persona_activacion']").val(persona_activacion);
		$("#eliminarPersonaModal").find("form").attr("action", base_url + getContextPath() + '/EliminarPersona');

	});


	$("body").on("click", ".eliminarUsuario", function() {
		var id_usuario = Number($(this).closest("tr").children("td").eq(0).html());
		event.preventDefault();

		console.log(id_usuario)
		Swal.fire({
			title: 'Eliminar',
			showCancelButton: true,
			confirmButtonColor: '#DD3333',
			cancelButtonColor: '#3085d6',
			confirmButtonText: 'Si',
			cancelButtonText: 'Cancelar'
		}).then((result) => {



			if (result.value) {

				$.ajax({
					url: base_url + getContextPath() + '/eliminarusuario',
					method: 'GET',
					data: {
						id_usuario: id_usuario
					},
					success: function(response) {
						console.log("enviado")
					}
				});


				Swal.fire(
					'Eliminado',
					'Su archivo se ha eliminado.',
					'success'
				)
				
			}
			location.reload();
		})


	});




	$(document).on("click", ".getDatosPersonales", function() {  // When HTML DOM "click" event is invoked on element with ID "somebutton", execute the following function...
		var nombre = $(this).closest("tr").children("td").eq(2).html();
		var apellido = $(this).closest("tr").children("td").eq(3).html();
		var email = $(this).closest("tr").children("td").eq(4).html();
		var telefono = $(this).closest("tr").children("td").eq(5).html();
		var direccion = $(this).closest("tr").children("td").eq(6).html();
		var sistema_prevision = $(this).closest("tr").children("td").eq(7).html();
		$("#agregarPersona").find("input[name='nombre']").val(nombre);
		$("#agregarPersona").find("input[name='apellido']").val(apellido);
		$("#agregarPersona").find("input[name='email']").val(email);
		$("#agregarPersona").find("input[name='telefono']").val(telefono);
		$("#agregarPersona").find("input[name='direccion']").val(direccion);
		$("#agregarPersona").find("input[name='sistema_prevision']").val(sistema_prevision);
	});

	$(document).on("click", ".editarDatosPersonales", function() {  // When HTML DOM "click" event is invoked on element with ID "somebutton", execute the following function...
		var usuario_nombre = $(this).closest("tr").children("td").eq(8).html();
		var nombre = $(this).closest("tr").children("td").eq(2).html();
		var apellido = $(this).closest("tr").children("td").eq(3).html();
		var email = $(this).closest("tr").children("td").eq(4).html();
		var telefono = $(this).closest("tr").children("td").eq(5).html();
		var direccion = $(this).closest("tr").children("td").eq(6).html();
		var sistema_prevision = $(this).closest("tr").children("td").eq(7).html();
		$("#editarPersona").find("input[name='usuario_nombre']").val(usuario_nombre);
		$("#editarPersona").find("input[name='nombre']").val(nombre);
		$("#editarPersona").find("input[name='apellido']").val(apellido);
		$("#editarPersona").find("input[name='email']").val(email);
		$("#editarPersona").find("input[name='telefono']").val(telefono);
		$("#editarPersona").find("input[name='direccion']").val(direccion);
		$("#editarPersona").find("input[name='sistema_prevision']").val(sistema_prevision);
	});

	//MODAL Editar Usuario FUll
	$("#agregarPersona").on("submit", function(event) {
		event.preventDefault();
		var formdata = $(this).serialize();

		console.log(formdata)

		$.ajax({
			url: base_url + getContextPath() + '/nuevapersona',
			method: 'POST',
			data: formdata,
			success: function(data) {
				// alert sweetalert2
				$("#agregarPersonaModal").modal("hide");
				location.reload();
			}
		});
	});



	//MODAL Nuevo Persona

	$("#agregarPersona").on("submit", function(event) {
		event.preventDefault();
		var formdata = $(this).serialize();

		console.log(formdata)

		$.ajax({
			url: base_url + getContextPath() + '/nuevapersona',
			method: 'POST',
			data: formdata,
			success: function(data) {
				// alert sweetalert2
				$("#agregarPersonaModal").modal("hide");
				location.reload();
			}
		});
	});

}); // Cierre document ready


var base_url = window.location.origin;
// "http://stackoverflow.com"

var host = window.location.host;
// stackoverflow.com



function getContextPath() {
	return window.location.pathname.substring(0, window.location.pathname.indexOf("/", 2));
}