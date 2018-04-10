'''


Given a non-empty string like "Code" return a string like "CCoCodCode".


string_splosion('Code') -> 'CCoCodCode'
string_splosion('abc') -> 'aababc'
string_splosion('ab') -> 'aab'

'''

def string_splosion(str):
  
 res = ''
 x = 0
 
 for x in range(0,len(str)):  
  res = res +str[:x]
 
 return res + str