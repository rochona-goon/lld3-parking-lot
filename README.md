# lld3-parking-lot

Parking Lot System - LLD

A clean-code implementation of a Parking Lot system using Java, focusing on SOLID principles and design patterns.

🚀 **Recent Updates**

* Ticket Generation Flow: Implemented a full flow from TicketController through TicketService to generate unique parking tickets.

* Repository Pattern: Added InMemory repositories for Gate, ParkingLot, Ticket, and Vehicle to decouple data storage from business logic.

* Strategy Pattern: Migrated slot assignment logic to a dedicated Strategies.SlotAssignment package.

🛠️ **System Architecture**
Design Patterns Used

**Strategy Pattern:** Used for parking slot allocation. Currently, supports:

* NearestSlotAssignmentStrategy: Finds the closest available slot of the most filled parking floor.

* FarthestSlotAssignmentStrategy: Finds the farthest available slot the most filled parking floor.

**Controller-Service-Repository Pattern:** 
Ensures clear separation of concerns.

**DTO (Data Transfer Objects):** 
Used IssueTicketRequest and IssueTicketResponse to prevent exposing internal models to the client.


**Core Entities**

* ParkingLot: The central entity containing levels, gates, and strategies.

* Ticket: Captures entry time, vehicle details, and the assigned slot.

* Gate: Manages entry/exit points and associated operators.

🚦 **Features**

*  Ticket Generation with automated slot assignment.
 
* Support for multiple vehicle types (Car, Bike, etc.).

* Custom Exception handling for GateNotFound and ParkingSlotNotAvailable.
