'''


Given a string of even length, return the first half. So the string "WooHoo" yields "Woo".


first_half('WooHoo') -> 'Woo'
first_half('HelloThere') -> 'Hello'
first_half('abcdef') -> 'abc'

'''

def first_half(str):
  
 even = len(str)%2
 
 if even == 0:
  return str[:len(str)/2]
  
 return str 