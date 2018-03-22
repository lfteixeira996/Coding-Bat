'''

Given a string, return a new string where "not " has been added to the front. However, if the string already begins with "not", return the string unchanged.


not_string('candy') → 'not candy'
not_string('x') → 'not x'
not_string('not bad') → 'not bad'

'''

def not_string(str):
 if(len(str) >= 3 and str[0]=='n' and str[1]=='o' and str[2]=='t'):
  return str
  
 else:
  return 'not ' + str;   
