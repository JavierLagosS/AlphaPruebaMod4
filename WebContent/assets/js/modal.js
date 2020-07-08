$(document).ready(function(){
	$("body").on("click", ".eliminarPersona", function() {
		var id_persona = Number($(this).closest("tr").children("td").eq(0).html());
		var persona_activacion = 0;
		$("#procesarEliminarPersona").find("input[name='id_persona']").val(id_persona);
		$("#procesarEliminarPersona").find("input[name='persona_activacion']").val(persona_activacion);
		$("#eliminarPersonaModal").find("form").attr("action", base_url + getContextPath() + '/ProcesarDelete');

	});

	
});

	var base_url = window.location.origin;
	// "http://stackoverflow.com"

	var host = window.location.host;
	// stackoverflow.com



	function getContextPath() {
		return window.location.pathname.substring(0, window.location.pathname.indexOf("/", 2));
	}