'''


Return True if the string "cat" and "dog" appear the same number of times in the given string.


cat_dog('catdog') → True
cat_dog('catcat') → False
cat_dog('1cat1cadodog') → True

'''

def cat_dog(str):
  
  dictz = {}
  dictz['cat'] = 0
  dictz['dog'] = 0
  
  
  
  if('cat' in str):
    dictz['cat'] +=1
    
  if('dog' in str):
    dictz['dog'] +=1
    
  if dictz['cat'] == dictz['dog']:
    return True
    
  return False  
    