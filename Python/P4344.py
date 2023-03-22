test_index = int(input())

for i in range(0,test_index):
    score_input = list(map(int, input().split()))
    n = score_input[0]
    scores = score_input[1:]
    avg_score = sum(scores)/len(scores) * 1.0

    over_avg =0
    for j in range(0,n):
        if scores[j] > avg_score:
            over_avg+=1
    print_num = (round(over_avg/n*100.0,3))
    print("{:.3f}".format(print_num)+"%")

