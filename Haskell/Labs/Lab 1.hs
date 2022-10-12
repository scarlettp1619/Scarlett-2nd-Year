module Main where

main :: IO ()
main =
   print $ sort [5, 1, 79, 33, 6, 2]

-- function int list into integer --
len :: [Int] -> Int
len []
  = 0
len (x : xs)
  = 1 + len xs

-- function string list to string to bool --
contains :: [String] -> String -> Bool
contains [] e
   = False
contains (x:xs) e
  | x == e = True
  | otherwise = contains xs e

-- function string list to bool --
set :: [String] -> Bool
set []
  = True
set (x:xs)
  | contains xs x = False
  | otherwise = set xs

largest :: [Int] -> Int
largest [x]
  = x
largest (x:xs)
  = max x (largest xs)

zipped :: ([a],[b]) -> [(a,b)]
zipped ([],[])
  = []
zipped (x:xs, y:ys)
  = (x,y) : zipped (xs,ys)

insert :: Int -> [Int] -> [Int]
insert e []
    = [e]
insert e (x:xs)
  | e > x  = x : insert e xs
  | otherwise  = e : x : xs

sort :: [Int] -> [Int]
sort []
  = []
sort (x:xs)
  = insert x (sort xs)
