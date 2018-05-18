import unittest

'''

Given two strings, return True if either of the strings appears at the very end of the other string,
ignoring upper/lower case differences (in other words, the computation should not be "case sensitive"). 
Note: s.lower() returns the lowercase version of a string.


end_other('Hiabc', 'abc') -> True
end_other('AbC', 'HiaBc') -> True
end_other('abc', 'abXabc') -> True

'''

def end_other(a, b):
  
    stra = a.lower()
    strb = b.lower()
      
    max_a = len(stra)
    max_b = len(strb)
  
    if max_a > max_b:
        big_len = max_a
        low_len = max_b
        use_a   = stra 
        use_b   = strb
  
    else:
        big_len = max_b
        low_len = max_a
        use_a   = strb 
        use_b   = stra
    
    #bigger  
    i = big_len - 1
  
    #lower
    for item in range(low_len-1, -1, -1):
    
        if use_b[item] != use_a[i] :
            return False
      
        i -=1
      
    return True  


class Test_end_other(unittest.TestCase):

    def test_1(self):
        self.assertEqual(end_other('Hiabc', 'abc'), True)

    def test_2(self):
        self.assertEqual(end_other('AbC', 'HiaBc'), True)

    def test_3(self):
        self.assertEqual(end_other('abc', 'abXabc'), True)


if __name__ == '__main__':
    unittest.main() 