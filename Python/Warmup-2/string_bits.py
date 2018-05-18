import unittest

'''
Given a string, return a new string made of every other char starting with the first, so "Hello" yields "Hlo".


string_bits('Hello') -> 'Hlo'
string_bits('Hi') -> 'H'
string_bits('Heeololeo') -> 'Hello'

'''

def string_bits(str):
  
    result = ""
    
    # Many ways to do this. This uses the standard loop of i on every char,
    # and inside the loop skips the odd index values.
    for i in range(len(str)):
        if i % 2 == 0:
            result = result + str[i]

    return result 



class Test_string_bits(unittest.TestCase):

    def test_1(self):
        self.assertEqual(string_bits('Hello'), 'Hlo')

    def test_2(self):
        self.assertEqual(string_bits('Hi'), 'H')

    def test_3(self):
        self.assertEqual(string_bits('Heeololeo'), 'Hello')


if __name__ == '__main__':
    unittest.main() 