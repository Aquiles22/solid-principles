# Principios SOLID

Los principios SOLID son un conjunto de cinco principios de diseño de software que ayudan a crear sistemas más mantenibles, escalables y flexibles([ver mas](https://sites.google.com/site/unclebobconsultingllc/getting-a-solid-start)). 

![](/solid-principles/img/solid.png)

## Resumen de los principios

| Principio | Descripción | Clase que viola el principio | Clase que soluciona el principio |
| ------ |------- | :-----:| :-----:|
| SRP    | Una clase debe tener una sola razón para cambiar | [Employee](/solid-principles/src/main/java/com/example/solid/single/wrong/Employee.java) | [EmployeeRepository](/solid-principles/src/main/java/com/example/solid/single/ok/EmployeeRepository.java), [PayrollService](/solid-principles/src/main/java/com/example/solid/single/ok/PayrollService.java) |
| OCP     | Una clase debe estar abierta para su extensión pero cerrada para su modificación | [PaymentGateway](/solid-principles/src/main/java/com/example/solid/open/wrong/PaymentGateway.java) | [PaymentProcessor](/solid-principles/src/main/java/com/example/solid/open/ok/PaymentProcessor.java), [CreditCardPaymentProcessor](/solid-principles/src/main/java/com/example/solid/open/ok/CreditCardPaymentProcessor.java), [PayPalPaymentProcessor](/solid-principles/src/main/java/com/example/solid/open/ok/PayPalPaymentProcessor.java) |
| LSP | Las clases derivadas deben ser sustituibles por sus clases base | [Bird](/solid-principles/src/main/java/com/example/solid/liskov/wrong/Bird.java) | [FlyingBird](/solid-principles/src/main/java/com/example/solid/liskov/ok/FlyingBird.java), [Eagle](/solid-principles/src/main/java/com/example/solid/liskov/ok/Eagle.java) |
| ISP | Una clase no debe ser forzada a implementar una interfaz que no utiliza | [Printer](/solid-principles/src/main/java/com/example/solid/interfaces/wrong/Printer.java) | [Printable](/solid-principles/src/main/java/com/example/solid/interfaces/ok/Printable.java), [Scannable](/solid-principles/src/main/java/com/example/solid/interfaces/ok/Scannable.java), [Photocopier](/solid-principles/src/main/java/com/example/solid/interfaces/ok/Photocopier.java) |
| DIP | Las clases de alto nivel no deben depender de las clases de bajo nivel, ambas deben depender de abstracciones | [Car](/solid-principles/src/main/java/com/example/solid/dependency/wrong/Car.java) | [CarFactory](/solid-principles/src/main/java/com/example/solid/dependency/ok/CarFactory.java) |

## Explicación de cada principio

### SRP (Single Responsibility Principle)

La clase Employee viola el principio SRP porque tiene más de una razón para cambiar (guardar en base de datos y imprimir nómina). Las clases EmployeeRepository y PayrollService solucionan este principio al separar las responsabilidades.

### OCP (Open/Closed Principle)

La clase PaymentGateway viola el principio OCP porque no está abierta para su extensión (no se puede agregar un nuevo tipo de pago sin modificar la clase). Las clases PaymentProcessor, CreditCardPaymentProcessor y PayPalPaymentProcessor solucionan este principio al crear una jerarquía de clases que permite agregar nuevos tipos de pago sin modificar la clase base.

### LSP (Liskov Substitution Principle)

La clase Bird viola el principio LSP porque no se puede sustituir por sus clases derivadas (no todos los pájaros pueden volar). Las clases FlyingBird y Eagle solucionan este principio al crear una jerarquía de clases que permite sustituir las clases derivadas por sus clases base.

### ISP (Interface Segregation Principle)

La clase Printer viola el principio ISP porque fuerza a implementar una interfaz que no utiliza (no todos los impresores pueden escanear). Las clases Printable, Scannable y Photocopier solucionan este principio al crear interfaces separadas para cada funcionalidad.

### DIP (Dependency Inversion Principle)

La clase Car viola el principio DIP porque depende de una clase de bajo nivel (GasolineEngine). Las clases Engine y CarFactory solucionan este principio al crear una abstracción que permite cambiar el tipo de motor sin modificar la clase Car.