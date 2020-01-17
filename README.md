Topic:    INVERTED INDEXING  USING MAPREDUCE PROG. 
=============================

## Hadoop - Version 1.0 

## 1. INTRODUCTION : 
Inverted index is index data structure for storing mapping results from content, such    as words or numbers, to its locations in a database file or in a document or a set     of documents. Most of the text searching systems rely on inverted index to       search the documents that contains a given word or a term. 
 
## 1.1 PURPOSE 
   Map Reduce implements various mathematical algorithms to divide a task into small parts and  assign them to multiple systems. In technical terms, Map Reduce algorithm helps in sending the  Map & Reduce tasks to appropriate servers in a cluster. 
  Like:> Sorting ,Searching ,Indexing ,TF-IDF . 
where we implemented few small things in indexing algorithm . 
 
## 1.2  INDEXING  
  Normally indexing is used to point to a particular data and its address. It performs batch  indexing on the input files for a particular Mapper.The indexing technique that is normally used  in MapReduce is known as inverted index .   Search engines like Google and Bing use inverted  indexing technique. 
  
##  2. Applications: 
The inverted index data structure is a central component of a typical search engine indexing algorithm. A goal of a search engine implementation is to optimize the speed of the query: find the documents where word X occurs. Once a forward index is developed, which stores lists of words per document, it is next inverted to develop an inverted index. Querying the forward index would require sequential iteration through each document and to each word to verify a matching document. The time, memory, and processing resources to perform such a query are not always technically realistic. Instead of listing the words per document in the forward index, the inverted index data structure is developed which lists the documents per word. 
With the inverted index created, the query can now be resolved by jumping to the word ID (via random access) in the inverted index. In pre-computer times, concordances to important books were manually assembled. These were effectively inverted indexes with a small amount of accompanying commentary that required a tremendous amount of effort to produce. In bioinformatics, inverted indexes are very important in the sequence assembly of short fragments of sequenced DNA. One way to find the source of a fragment is to search for it against a reference DNA sequence. A small number of mismatches (due to differences between the sequenced DNA and reference DNA, or errors) can be accounted for by dividing the fragment into smaller fragments—at least one subfragment is likely to match the reference DNA sequence. The matching requires constructing an inverted index of all substrings of a certain length from the reference DNA sequence. Since the human DNA contains more than 3 billion base pairs, and we need to store a DNA substring for every index and a 32-bit integer for index itself, the storage requirement for such an inverted index would probably be in the tens of gigabytes. 
