Curso de Spring:

Anotaciones :

	-	@SpringBootApplication  :   establece el punto de entrada de la app, marca donde se encuentra el main de la app, tambien escanea el 									proyecto identificando los 	componentes spring
	
	-	@Controller             :	Configura a la clase como un componente de spring del tipo controlador
	-	@RequestMapping(value= "/index") :  se usa par marcar un metodo a una ruta o path en el navegador, al ingresar al path el valor de 									value se ejecutará el metodo marcado, por defecto el metodo seria GET, tambien se usa para marcar 									controladores y asi poder llamar en el path a sus metodos tambien mapeados
	-	@GetMapping("/")  : es igual que el request mapping pero pára este caso no es necesario indicar el metodo y por defecto se puede omitir 							value e indicar solo la ruta
	-	@PostMapping("/") : igual que get mapping pero es para methodos post.
	-	@ModelAttibute    : se usa para indicar un modelo con los atributos que se van a pasar a la vista en otro metodo distinto al que esta 							marcado con la anotación y va a ser transversal a todos los metodos del controlador y no de un solo metodo
	-	@RequestParam(name="text") : se usa antes de un parametro de metodo para indicar que ese parametro viene en el path y se indica el 									 									nombre en caso que el parametro del metodo no tenga el mismo nombre del parametro del path, tambien se 									puede indicar el valor por defecto  e indicar tambien si es requerido
	- @PathVariable(name="texto") : esta anotación se usa para indicar que un tramo donde va un parametro de la ruta va a ser variable y se antepone de la declaracion del parametro del metodo que va a recibir el parametro de la ruta
	