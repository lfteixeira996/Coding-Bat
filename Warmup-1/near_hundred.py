'''

Given an int n, return True if it is within 10 of 100 or 200. Note: abs(num) computes the absolute value of a number.


near_hundred(93) → True
near_hundred(90) → True
near_hundred(89) → False

'''

def near_hundred(n):
  
 check = abs(n)
 
 if (check>=90 and check<=110) or (check>=190 and check<=210):
  return True
  
 return False 