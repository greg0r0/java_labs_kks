#compile classes
javac -Xlint:unchecked ./lab4_binary_tree/*.java 
#run main
java ./main.java
#delete classes
rm -rf ./lab4_binary_tree/*.class
