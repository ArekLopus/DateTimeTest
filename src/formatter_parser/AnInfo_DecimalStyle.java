package formatter_parser;

//		DecimalStyle	- class

//-Localized decimal style used in date and time formatting.
//-A significant part of dealing with dates and times is the localization. This class acts as a central point for accessing the information.

//Field Summary
//	static DecimalStyle	STANDARD	- The standard set of non-localized decimal style symbols.

//Method Summary
//	static getAvailableLocales()				- Lists all the locales that are supported.
//	getDecimalSeparator()						- Gets the character that represents the decimal point.
//	getNegativeSign()							- Gets the character that represents the negative sign.
//	getPositiveSign()							- Gets the character that represents the positive sign.
//	getZeroDigit()								- Gets the character that represents zero.
//	static of​(Locale locale)					- Obtains the DecimalStyle for the specified locale.
//	static ofDefaultLocale()					- Obtains the DecimalStyle for the default FORMAT locale.
//	withDecimalSeparator​(char decimalSeparator)	- Returns a copy of the info with a new character that represents the decimal point.
//	withNegativeSign​(char negativeSign)			- Returns a copy of the info with a new character that represents the negative sign.
//	withPositiveSign​(char positiveSign)			- Returns a copy of the info with a new character that represents the positive sign.
//	withZeroDigit​(char zeroDigit)				- Returns a copy of the info with a new character that represents zero.

public class AnInfo_DecimalStyle {}