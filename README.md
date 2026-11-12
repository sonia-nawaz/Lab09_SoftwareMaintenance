# Lab 09 - Software Maintenance

**Course:** Software Construction | **Class:** 5th Semester, Software Engineering
**University:** UET Abbottabad Campus | **Instructor:** Engr. Rizwan Shah

## Tasks

| Task | Package | Description |
|---|---|---|
| 1 | `task1` | Refactored `ReportManager`: `String.join`, null-safe `type`, `ReportFormatter` interface (PDF/CSV), `Notifier` injected via constructor |
| 2 | `task2` | `BankTransfer` record with fail-fast guard clauses (`Objects.requireNonNull`, amount > 0) |
| 3 | `task3` | `PaymentProcessor` simulating SLF4J MDC trace IDs with `try-finally` cleanup |
| 4 | `task4` | `OrderService` + JUnit 5 test `calculateTotal_appliesVipDiscount_withoutTouchingDatabase()` |

## Requirements
- JDK 17+
- Maven (bundled with NetBeans)

## How to run
1. Clone the repo and open it in NetBeans (File → Open Project).
2. Task 1: run `Lab09_SoftwareMaintenance.java` in `task1`.
3. Task 2: run `BankTransferMain.java` in `task2`.
4. Task 3: run `PaymentProcessorMain.java` in `task3`.
5. Task 4: right-click `OrderServiceTest.java` → Test File, or run `mvn test`.
