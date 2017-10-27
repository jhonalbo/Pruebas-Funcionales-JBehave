Antes de empezar se debe instalar el plugin "Natural" para Eclipse o IntelliJ (aparece como JBehave)
El proyeto se puede abrir Eclipse o IntelliJ (desde Eclipse: import->Gradle Project->seleccionar carpeta principal del proyecto->clic en Buil Model->seleccionar proyecto base->finish)

La secuencia básica para realizar una prueba funcional con JBehave es:
* Crear historia de usuario (*.story)
* Crear los "steps" (*Step.java)
* Crear "definitions" (*Definitions.java)
* Crear "pages" (*Pages.java)

Las pruebas en este ejemplo se le realizarán a la funcionalidad del login de la siguiente página: http://sahitest.com/demo/training/login.htm