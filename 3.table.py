def generate_table(n):
    num_base = n
    num_cant = 10
    counter = 0
    
    print('Tabla del %s' % (num_base))
    for c in range(num_cant):
        counter += 1
        print('{0} x {1} = {2}'.format(num_base, counter, num_base * counter))

a = 1
b = 2
c = 3
d = 4
e = 5
f = 6
g = 7
h = 8
i = 9
j = 10
k = 11
l = 12
m = 13
n = 14
o = 15
p = 16
q = 17
r = 18
s = 19
t = 20
generate_table(a)
generate_table(b)
generate_table(c)
generate_table(d)
generate_table(e)
generate_table(f)
generate_table(g)
generate_table(h)
generate_table(i)
generate_table(j)
generate_table(k)
generate_table(l)
generate_table(m)
generate_table(n)
generate_table(o)
generate_table(p)
generate_table(q)
generate_table(r)
generate_table(s)
generate_table(t)
