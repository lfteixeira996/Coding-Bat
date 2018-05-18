import unittest

'''

Given 2 strings, a and b, return a string of the form short+long+short,
with the shorter string on the outside and the longer string on the inside. 
The strings will not be the same length, but they may be empty (length 0).


combo_string('Hello', 'hi') -> 'hiHellohi'
combo_string('hi', 'Hello') -> 'hiHellohi'
combo_string('aaa', 'b') -> 'baaab'

'''

def combo_string(a, b):
  
    if len(a)== 0 and len(b)==0:
        return ''
   
    elif len(a) > len(b):
        return b+a+b
  
    return a+b+a


class Test_combo_string(unittest.TestCase):

    def test_1(self):
        self.assertEqual(sorta_sum(3, 4), 7)

    def test_2(self):
        self.assertEqual(sorta_sum(9, 4), 20)

    def test_3(self):
        self.assertEqual(sorta_sum(9, 4), 20)


if __name__ == '__main__':
    unittest.main()  
 
  