import unittest

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
 
 
class Test_string_splosion(unittest.TestCase):

    def test_1(self):
        self.assertEqual(string_splosion('Code'), 'CCoCodCode')

    def test_2(self):
        self.assertEqual(string_splosion('abc'), 'aababc')

    def test_3(self):
        self.assertEqual(string_splosion('ab'), 'aab')


if __name__ == '__main__':
    unittest.main() 