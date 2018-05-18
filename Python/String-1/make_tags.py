import unittest

'''

The web is built with HTML strings like "<i>Yay</i>" which draws Yay as italic text.
In this example, the "i" tag makes <i> and </i> which surround the word "Yay". 
Given tag and word strings, create the HTML string with tags around the word, e.g. "<i>Yay</i>".


make_tags('i', 'Yay') -> '<i>Yay</i>'
make_tags('i', 'Hello') -> '<i>Hello</i>'
make_tags('cite', 'Yay') -> '<cite>Yay</cite>'

'''

def make_tags(tag, word):
    return '<'+tag+'>'+word+'</'+tag+'>'  


class Test_make_tags(unittest.TestCase):

    def test_1(self):
        self.assertEqual(make_tags('i', 'Yay'), '<i>Yay</i>')

    def test_2(self):
        self.assertEqual(make_tags('i', 'Hello'), '<i>Hello</i>')

    def test_3(self):
        self.assertEqual(make_tags('cite', 'Yay'), '<cite>Yay</cite>')


if __name__ == '__main__':
    unittest.main()    