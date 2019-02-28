package formatter_parser;

//		FormatStyle
//-Enumeration of the style of a localized date, time or date-time formatter.
//-These styles are used when obtaining a date-time style from configuration. See DateTimeFormatter and DateTimeFormatterBuilder for usage.
//
//Enum Constant Summary
//	FULL	- Full text style, with the most detail.
//	LONG	- Long text style, with lots of detail.
//	MEDIUM	- Medium text style, with some detail.
//	SHORT	- Short text style, typically numeric.
//
//Method Summary
//	static valueOf​(String name)	- Returns the enum constant of this type with the specified name.
//	static values()				- Returns an array containing the constants of this enum type, in the order they are declared.


//		ResolverStyle
//-Enumeration of different ways to resolve dates and times.
//-Parsing a text string occurs in two phases.
//-Phase 1 is a basic text parse according to the fields added to the builder.
//-Phase 2 resolves the parsed field-value pairs into date and/or time objects. This style is used to control how phase 2, resolving, happens.
//
//Enum Constant Summary
//	LENIENT	- Style to resolve dates and times leniently.
//	SMART	- Style to resolve dates and times in a smart, or intelligent, manner.
//	STRICT	- Style to resolve dates and times strictly.
//
//Method Summary
//	static valueOf​(String name)			- Returns the enum constant of this type with the specified name.
//	static ResolverStyle[]	values()	- Returns an array containing the constants of this enum type, in the order they are declared.


//		SignStyle
//-Enumeration of ways to handle the positive/negative sign.
//-The formatting engine allows the positive and negative signs of numbers to be controlled using this enum.
// See DateTimeFormatterBuilder for usage.
//
//Enum Constant Summary
//	ALWAYS			- Style to always output the sign, where zero will output '+'.
//	EXCEEDS_PAD		- Style to always output the sign if the value exceeds the pad width.
//	NEVER			- Style to never output sign, only outputting the absolute value.
//	NORMAL			- Style to output the sign only if the value is negative.
//	NOT_NEGATIVE	- Style to block negative values, throwing an exception on printing.
//
//Method Summary
//	static valueOf​(String name)	- Returns the enum constant of this type with the specified name.
//	static values()				- Returns an array containing the constants of this enum type, in the order they are declared.


//		TextStyle
//-Enumeration of the style of text formatting and parsing.
//-Text styles define three sizes for the formatted text - 'full', 'short' and 'narrow'.
// Each of these three sizes is available in both 'standard' and 'stand-alone' variations.
//
//-The difference between the three sizes is obvious in most languages.
// For example, in English the 'full' month is 'January', the 'short' month is 'Jan' and the 'narrow' month is 'J'.
// Note that the narrow size is often not unique. For example, 'January', 'June' and 'July' all have the 'narrow' text 'J'.
//
//-The difference between the 'standard' and 'stand-alone' forms is trickier to describe as there is no difference in English.
// However, in other languages there is a difference in the word used when the text is used alone, as opposed to in a complete date.
// Fe, the word used for a month when used alone in a date picker is different to the word used for month in association with a day and year in a date.
//
//Enum Constant Summary
//	FULL				- Full text, typically the full description.
//	FULL_STANDALONE		- Full text for stand-alone use, typically the full description.
//	NARROW				- Narrow text, typically a single letter.
//	NARROW_STANDALONE	- Narrow text for stand-alone use, typically a single letter.
//	SHORT				- Short text, typically an abbreviation.
//SHORT_STANDALONE		- Short text for stand-alone use, typically an abbreviation.
//
//Method Summary
//	asNormal()						- Returns the normal style with the same size.
//	asStandalone()					- Returns the stand-alone style with the same size.
//	isStandalone()					- Returns true if the Style is a stand-alone style.
//	static valueOf​(String name)		- Returns the enum constant of this type with the specified name.
//	static values()					- Returns an array containing the constants of this enum type, in the order they are declared.

public class AnInfo_Enums {}