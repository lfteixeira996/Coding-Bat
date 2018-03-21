'''

Given a string, return a string where for every char in the original, there are two chars.


double_char('The') → 'TThhee'
double_char('AAbb') → 'AAAAbbbb'
double_char('Hi-There') → 'HHii--TThheerree'

'''

def double_char(str):
 
 res = '' 
 val = len(str)
 for i in range(0,(val)):
  res=res + (2*str[i])
  
 return res 