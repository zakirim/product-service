
### Assignment Step Description

The following should be returned as Json (field names are in bold) :
An array of products. Each element should contain:
productId <String>
title <String>
An array of colorSwatches. Each element should contain:
color<String>
rgbColor<String> which is an RGB  representation of the basicColor in a six digit hexadecimal format, e.g. “F0A1C2”.
skuid<String>
nowPrice<String> which is the price.now represented as a string, including the currency, e.g. “£1.75”. For values that are integer, if they are less £10 return a decimal price, otherwise show an integer price, e.g. “£2.00” or  “£10”. 
priceLabel<String>. An optional query parm called labelType can be set to any of:
    1. ShowWasNow - in which case return a string saying “Was £x.xx, now £y.yyy”. 
    2. ShowWasThenNow - in which case return a string saying “Was £x.xx, then £y.yy, now £z.zzz”. If the original price.then2 is not empty use that for the “then” price otherwise use the then1 price. If the then1 price is also empty then don’t show the “then” price.
    3. ShowPercDscount  - in which case return “x% off - now £y.yy”.
If the query parm is not set default to use ShowWasNow format.
In all cases use the price formatting as described for nowPrice.

The array of products should only contain products with a price reduction and should be sorted to show the highest price reduction first. Price reduction is calculated using price.was - price.now. 

Looking up RGB values
Create a hash table or similar device to translate basicColor to RGB.

Trapping errors with the data provided by the API:
If there is invalid data on the input file then write out an empty string or assume a value of zero rather than throwing exceptions or creating complex error logging.

Kotlin
If you have experience of Kotlin you may do the exercise in Kotlin instead of Java.

Returning the test
Please provide a link to a GitHub repo containing the code, including any special instructions. We will be looking for code that is clean and maintainable.