# lld3-parking-lot

Parking Lot System - LLD

A clean-code implementation of a Parking Lot system using Java, focusing on SOLID principles and design patterns.

🚀 **Recent Updates**

* Payment Integration Flow: Implemented a full flow from PaymentController through PaymentService to making payment against a parking ticket bill.

* Repository Pattern: Added InMemory repository for Payment to decouple data storage from business logic.

🛠️ **System Architecture**
Design Patterns Used

**Adapter Pattern:**  

* Used for integrating third party services (ex. Razorpay API) with the payment service.

* Created a payment gateway interface to keep the integration loosely coupled.

* Implemented Adapter class for integrating third party payment API using PaymentGateway interface.


**Controller-Service-Repository Pattern:** 
Ensures clear separation of concerns.

**DTO (Data Transfer Objects):** 
Used PaymentRequestDTO and PaymentResponseDTO to prevent exposing internal models to the client.

**Core Entity**

* Payment: The central entity containing Bill details, transaction details and payment amount information.


🚦 **Features**

* Payment Integration with third party services.

* Custom Exception handling of PaymentBillNotFound for invalid bill.
