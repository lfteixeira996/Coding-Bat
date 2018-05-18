import unittest

'''

Given a string name, e.g. "Bob", return a greeting of the form "Hello Bob!".


hello_name('Bob') -> 'Hello Bob!'
hello_name('Alice') -> 'Hello Alice!'
hello_name('X') -> 'Hello X!'

'''

def hello_name(name):
    
    return 'Hello '+ name+ '!'  


class Test_hello_name(unittest.TestCase):

    def test_1(self):
        self.assertEqual(hello_name('Bob'), 'Hello Bob!')

    def test_2(self):
        self.assertEqual(hello_name('Alice'), 'Hello Alice!')

    def test_3(self):
        self.assertEqual(hello_name('X'), 'Hello X!')


if __name__ == '__main__':
    unittest.main()  
