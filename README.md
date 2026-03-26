# 🎫 Support Center Ticket System (FIFO & LIFO)

This project simulates a high-efficiency support center that manages different types of service requests using advanced data structures. It demonstrates a deep understanding of how information flows through a system based on business priority.

## 🚀 Architectural Highlights
- **Interface-Based Design**: Uses a `Ticket` interface to decouple the system's logic from specific implementations, allowing for easy scalability.
- **FIFO (First-In, First-Out)**: Implements a `Queue` (LinkedList) to manage customer tickets, ensuring the first person to ask for help is the first one served.
- **LIFO (Last-In, First-Out)**: Implements a `Stack` for internal technical tasks, prioritizing the most recent system requirements.
- **Automatic ID Sequencing**: Features independent static counters for Customer and Internal tickets to maintain a clean tracking history.

## 🛠️ Technical Implementation
- **TicketCliente**: Specialized for external users with IDs starting from 1.
- **TicketInterno**: Optimized for system maintenance with IDs starting from 100.
- **CentroSoporte**: The core engine that orchestrates the processing and reporting of all pending tasks.

---
*Mastering data structures to build organized and scalable solutions.*
