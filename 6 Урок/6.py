# -*- coding: utf-8 -*-

from tkinter import *
from tkinter import messagebox

def d1():
    arg = txt.get()
    i = 1
    N = int(arg)
    result = ""
    while i * i <= N:
        i+=1
        result += str(i)
    messagebox.showinfo('Результат', result)

def d2():
    arg = txt1.get()
    i = 2
    N = int(arg)
    while N % i != 0:
        i += 1
    messagebox.showinfo('Результат', i)

def d3():
    arg = txt2.get()
    N = int(arg)
    alll = 2
    step = 1
    while alll <= N:
        alll *= 2
        step += 1
    messagebox.showinfo('Результат', "Степень: " + str(step - 1) + " " + "показатель степени: " + str(alll // 2))

def d4():
    x = int(txt3_1.get())
    y = int(txt3_2.get())
    numb = 1
    while x < y:
        x *= 1.1
        numb += 1
    messagebox.showinfo('Результат', numb)

u0c1 = 0
def d5():
    global u0c1
    arg = txt4.get()
    if(arg != "0"):
        u0c1 += 1
    else:
        messagebox.showinfo('Результат', u0c1)
        u0c1 = 0
    txt4.delete(0, END)

u0c2 = 0
summ = 0
def d6():
    global u0c2
    global summ
    arg = txt5.get()
    if arg != "0":
        u0c2+=1
        summ += int(arg)
    else:
        messagebox.showinfo('Результат', summ / u0c2)
        u0c2 = 0
        summ = 0
    txt5.delete(0, END)

u0c3 = 0
cn = 999999999
def d7():
    global u0c3
    global cn
    arg = txt6.get()
    if(int(arg) > cn):
        u0c3 += 1
    cn = int(arg)
    if(arg == "0"):
        messagebox.showinfo('Результат', u0c3)
        cn = 999999999
        u0c3 = 0
    txt6.delete(0, END)

u0c4 = 0
cn2 = 999999999
strc = 0
def d8():
    global u0c4
    global cn2
    global strc
    arg = txt7.get()
    x = int(arg)
    if x == cn2:
            u0c4 += 1
    else:
        if strc < u0c4:
            strc = u0c4
        u0c4 = 1
    cn2 = x
    if x == 0:
        messagebox.showinfo('Результат', max(strc, u0c4))
        cn2 = 999999999
    txt7.delete(0, END)

window = Tk()
window.title("Все программы")
window.geometry('500x300')
lbl = Label(window, text = "Введите число")
lbl.grid(column=0, row = 0)
txt = Entry(window, width = 10)
txt.grid(column=1, row = 0)
btn = Button(window, text = "Фукнция 5_1", command = d1)
btn.grid(column=2, row = 0)

lbl1 = Label(window, text = "Введите число")
lbl1.grid(column=0, row = 1)
txt1 = Entry(window, width = 10)
txt1.grid(column=1, row = 1)
btn1 = Button(window, text = "Фукнция 5_2",command = d2)
btn1.grid(column=2, row = 1)

lbl2 = Label(window, text = "Введите число")
lbl2.grid(column=0, row = 2)
txt2 = Entry(window, width = 10)
txt2.grid(column=1, row = 2)
btn2 = Button(window, text = "Фукнция 5_3", command = d3)
btn2.grid(column=2, row = 2)

lbl3 = Label(window, text = "Введите 2 числа")
lbl3.grid(column=0, row = 3)
txt3_1 = Entry(window, width = 10)
txt3_1.grid(column=1, row = 3)
txt3_2 = Entry(window, width = 10)
txt3_2.grid(column=2, row = 3)
btn3 = Button(window, text = "Фукнция 5_4", command = d4)
btn3.grid(column=3, row = 3)

lbl4_1 = Label(window, text = "Число 0 остановит")
lbl4_1.grid(column=0, row = 4)
txt4 = Entry(window, width = 10)
txt4.grid(column=1, row = 4)
btn4 = Button(window, text = "Фукнция 5_5", command = d5)
btn4.grid(column=2, row = 4)

lbl5 = Label(window, text = "Число 0 остановит")
lbl5.grid(column=0, row = 5)
txt5 = Entry(window, width = 10)
txt5.grid(column=1, row = 5)
btn5 = Button(window, text = "Фукнция 5_6", command = d6)
btn5.grid(column=2, row = 5)

lbl6 = Label(window, text = "Число 0 остановит")
lbl6.grid(column=0, row = 6)
txt6 = Entry(window, width = 10)
txt6.grid(column=1, row = 6)
btn6 = Button(window, text = "Фукнция 5_7", command = d7)
btn6.grid(column=2, row = 6)

lbl7 = Label(window, text = "Число 0 остановит")
lbl7.grid(column=0, row = 7)
txt7 = Entry(window, width = 10)
txt7.grid(column=1, row = 7)
btn7 = Button(window, text = "Фукнция 5_8", command = d8)
btn7.grid(column=2, row = 7)

window.mainloop()