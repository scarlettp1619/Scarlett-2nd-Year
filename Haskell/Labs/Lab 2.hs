module Main where
import Data.List as L

main :: IO ()
main = do
-- L.union can be used to output the union of two lists (Data.List) --
    print $ L.union [3, 4, 5, 6] [6, 7, 8, 9]
-- L.intersect can be used to output the intersection of two lists (Data.List) --
    print $ L.intersect [3, 4, 5, 6] [6, 7, 8, 9]

memberSet :: Int -> [Int] -> Bool
memberSet e []
  = False
memberSet e (x:xs)
  | e == x = True
  | otherwise = memberSet e xs

unionSet :: [Int] -> [Int] -> [Int]
unionSet [] x
  = x
unionSet (x:xs) ys
  | memberSet x ys = unionSet xs ys
  | otherwise = x: unionSet xs ys

unionSetB :: Eq a => [a] -> [a] -> [a]
unionSetB xs ys
  = xs ++ [y | y <- ys, not (elem y xs)]

intersectSet :: Eq a => [a] -> [a] -> [a]
intersectSet [] _
  = []
intersectSet (x:xs) e
  | elem x e = x : intersectSet xs e
  | otherwise = intersect xs e

takeList :: Int -> [Int] -> [Int]
takeList 0 x
  = []
takeList n []
  = []
takeList n (x:xs)
  = x:takeList(n-1) xs

dropList :: Int -> [Int] -> [Int]
dropList 0 x
  = []
dropList n []
  = []
dropList n (x:xs)
  = dropList (n - 1) xs

split :: Int -> [Int] -> ([Int], [Int])
split 0 xs
  = ([0], xs)
split n []
  = ([], [])
split n (x:xs)
  = (x:as, bs) where (as, bs) = split (n-1) xs
