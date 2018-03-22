'''

Given a string, we'll say that the front is the first 3 chars of the string. If the string length is less than 3, the front is whatever is there. Return a new string which is 3 copies of the front.


front3('Java') → 'JavJavJav'
front3('Chocolate') → 'ChoChoCho'
front3('abc') → 'abcabcabc'

'''

def front3(str):
 if len(str)<1:
  return str
  
 else:
  char3 = str[0:3]
  return 3*char3
      
