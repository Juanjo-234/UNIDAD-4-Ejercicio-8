Resolución del ejercicio N°8 de la unidad 4 de programación 2.
Clase Abstracta (Impresora):

Funciona como la base común para todos los dispositivos de impresión. Define atributos compartidos como modelo y nivelTinta.

Declara el método abstracto imprimirDocumento(String documento), obligando a cada tipo de impresora a definir su propia lógica de impresión y validación de insumos.

Clases Concretas (Tecnologías de Impresión):

ImpresoraLaser: Implementa el método de impresión validando el nivel de tóner disponible en el cartucho láser.

ImpresoraTinta: Controla el nivel de tinta líquida (cian, magenta, amarillo, negro) antes de ejecutar el trabajo.

ImpresoraMatricial: Valida el estado de la cinta entintada o el cabezal de agujas para la impresión por impacto.

Clase Coordinadora (ServidorImpresion):

Actúa como el administrador central de los dispositivos. Mantiene una colección/lista de impresoras y permite enviar trabajos de impresión de forma genérica, delegando la ejecución a cada equipo sin importar su tecnología específica.

Clase Principal (Main):

Se encarga de instanciar impresoras de diferentes tecnologías con distintos niveles iniciales de consumibles, agregarlas al servidor de impresión, despachar trabajos y reflejar el estado operativo resultante por consola.
<img width="893" height="532" alt="Captura de pantalla 2026-10-28 102714" src="https://github.com/user-attachments/assets/b6be219b-9e27-4a58-b64d-e2f358f4b44e" />
<img width="953" height="412" alt="Captura de pantalla 2026-10-28 102720" src="https://github.com/user-attachments/assets/78e5583e-72b2-4df8-87ea-9ed77407c06d" />

