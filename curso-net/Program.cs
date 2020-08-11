
using System;

public class Node
{
    public Node next;
    public Object data;
}

public class LinkedList
{
    private Node head;

    public void printAllNodes()
    {
        Node current = head;
        while (current != null)
        {
            Console.WriteLine(current.data);
            current = current.next;
        }
    }

    public void AddFirst(Object data)
    {
        Node toAdd = new Node();

        toAdd.data = data;
        toAdd.next = head;

        head = toAdd;
    }

    public void AddLast(Object data)
    {
        if (head == null)
        {
            head = new Node();

            head.data = data;
            head.next = null;
        }
        else
        {
            Node toAdd = new Node();
            toAdd.data = data;

            Node current = head;
            while (current.next != null)
            {
                current = current.next;
            }

            current.next = toAdd;
        }
    }
}

class Program
{
    static void Main(string[] args)
    {
        Console.WriteLine("---------------listas---------------");
        Console.WriteLine("Agregar Inicio:");
        LinkedList myList1 = new LinkedList();

        myList1.AddFirst("Anderson");
        myList1.AddFirst("Figueroa");
        myList1.AddFirst("Loaiza");
        myList1.printAllNodes();

        Console.WriteLine();

        Console.WriteLine("Agregar Final:");
        LinkedList myList2 = new LinkedList();

        myList2.AddLast("Hola");
        myList2.AddLast("Mundo");
        myList2.AddLast("CS");
        myList2.printAllNodes();

        Console.ReadLine();
    }
}