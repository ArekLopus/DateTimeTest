package date_classes_other;

//		Clock	- public abstract class

//-A clock providing access to the current instant, date and time using a time-zone.
//-Instances of this class are used to find the current instant, which can be interpreted using the stored time-zone
// to find the current date and time. As such, a clock can be used instead of System.currentTimeMillis() and TimeZone.getDefault().
//
//=Use of a Clock is optional. All key date-time classes also have a now() factory method that uses the system clock in the default time zone.
// The primary purpose of this abstraction is to allow alternate clocks to be plugged in as and when required.
// Applications use an object to obtain the current time rather than a static method. This can simplify testing.
//
//-Best practice for applications is to pass a Clock into any method that requires the current instant.
// A dependency injection framework is one way to achieve this:
//  public class MyBean {
//    private Clock clock;  // dependency inject
//    ...
//    public void process(LocalDate eventDate) {
//      if (eventDate.isBefore(LocalDate.now(clock)) {
//        ...
//      }
//    }
//  }
//-This approach allows an alternate clock, such as fixed or offset to be used during testing.
//-The system factory methods provide clocks based on the best available system clock This may use System.currentTimeMillis(),
// or a higher resolution clock if one is available.

//	Implementation Requirements:
//-This abstract class must be implemented with care to ensure other classes operate correctly.
//-All implementations that can be instantiated must be final, immutable and thread-safe.
//-The principal methods are defined to allow the throwing of an exception. In normal use, no exceptions will be thrown,
// however one possible implementation would be to obtain the time from a central time server across the network.
// Obviously, in this case the lookup could fail, and so the method is permitted to throw an exception.
//
//-The returned instants from Clock work on a time-scale that ignores leap seconds, as described in Instant.
// If the implementation wraps a source that provides leap second information, then a mechanism should be used to "smooth" the leap second.
// The Java Time-Scale mandates the use of UTC-SLS, however clock impls may choose how accurate they are with the time-scale so long as they
// document how they work. Impls are therefore not required to actually perform the UTC-SLS slew or to otherwise be aware of leap seconds.
//
//-Implementations should implement Serializable wherever possible and must document whether or not they do support serialization.
//
//	Implementation Note:
//-The clock implementation provided here is based on the same underlying clock as System.currentTimeMillis(), but may have a precision
// finer than milliseconds if available. However, little to no guarantee is provided about the accuracy of the underlying clock.
//-Apps requiring a more accurate clock must implement this abstract class themselves using a different external clock, such as an NTP server.

public class Clock {}